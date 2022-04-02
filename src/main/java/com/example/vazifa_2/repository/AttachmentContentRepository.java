package com.example.vazifa_2.repository;

import com.example.vazifa_2.entity.AttachmentContent;
import com.example.vazifa_2.projection.CustomAttachmentContent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "attachmentcontent",collectionResourceRel = "list",
        excerptProjection =
        CustomAttachmentContent.class)
public interface AttachmentContentRepository extends JpaRepository<AttachmentContent,Integer> {

}
