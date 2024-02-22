package org.example.docviewbackend.service.impl;

import lombok.RequiredArgsConstructor;
import org.example.docviewbackend.model.Document;
import org.example.docviewbackend.repository.IDocumentRepo;
import org.example.docviewbackend.repository.IGenericRepo;
import org.example.docviewbackend.service.IDocumentService;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor // inyeccion de dependencias
public class DocumentServiceImpl extends CRUDImpl<Document, Integer> implements IDocumentService {

    private final IDocumentRepo repo;

    @Override
    protected IGenericRepo<Document, Integer> getRepo() {
        return repo;
    }

}
