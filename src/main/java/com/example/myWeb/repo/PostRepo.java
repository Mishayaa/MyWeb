package com.example.myWeb.repo;

import com.example.myWeb.models.Post;
import org.springframework.data.repository.CrudRepository;

public interface PostRepo extends CrudRepository<Post,Long> {
}
