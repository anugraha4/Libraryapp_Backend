package com.nest.Libraryapp_backend.dao;

import com.nest.Libraryapp_backend.model.Library;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface LibraryDao extends CrudRepository<Library,Integer> {

    @Query(value = "SELECT `id`, `author`, `booktitle`, `description`, `distributor`, `price`, `publisher`, `image` FROM `library` WHERE `booktitle`=:booktitle",nativeQuery = true)
    List<Library>Searchbook(@Param("booktitle") String booktitle);
}
