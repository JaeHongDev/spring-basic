package com.example.fileuploade.fileUploading;

import java.io.IOException;
import java.util.stream.Collectors;

import com.example.fileuploade.storage.StorageService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.method.annotation.MvcUriComponentsBuilder;

@Controller
public class FileUploadController {
  private final StorageService storageService;

  @Autowired
  public FileUploadController(StorageService storageService) {
    this.storageService = storageService;
  }

  @GetMapping("/")
  public String listUploadedFiles(Model model) throws IOException {
    model.addAttribute("files",
        storageService.loadAll()
            .map(path -> MvcUriComponentsBuilder
                .fromMethodName(FileUploadController.class, "serverFile", path.getFileName().toString()).build().toUri()
                .toString())
            .collect(Collectors.toList()));
    return "uploadForm";
  }

  @GetMapping("/files/{filename:.+}")
  @ResponseBody
  public ResponseEntity<Resource> serverFile(@PathVariable String filename){
    Resource file = storageService.loadAsResource(filename);
    return ResponseEntity.ok().header(HttpHeaders.CONTENT_DISPOSITION, "attchment; filename=\""+file.getFilename()+"\"").body(file);
    
  }
}