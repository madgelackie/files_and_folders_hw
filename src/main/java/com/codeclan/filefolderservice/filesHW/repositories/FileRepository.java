package com.codeclan.filefolderservice.filesHW.repositories;

import com.codeclan.filefolderservice.filesHW.models.File;
import com.codeclan.filefolderservice.filesHW.models.Folder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FileRepository extends JpaRepository<File, Long> {
}
