package org.example.docviewbackend.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean // Necessary
public interface IGenericRepo<T, ID> extends JpaRepository<T, ID> {

}
