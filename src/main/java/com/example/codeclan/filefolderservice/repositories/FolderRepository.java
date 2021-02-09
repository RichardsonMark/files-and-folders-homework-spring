package com.example.codeclan.filefolderservice.repositories;

import com.example.codeclan.filefolderservice.models.Folder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FolderRepository extends JpaRepository<Folder, Long> {
}
