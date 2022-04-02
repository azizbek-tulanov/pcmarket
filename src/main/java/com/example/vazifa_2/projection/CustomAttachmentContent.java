package com.example.vazifa_2.projection;

import com.example.vazifa_2.entity.Attachment;
import com.example.vazifa_2.entity.AttachmentContent;
import org.springframework.data.rest.core.config.Projection;

@Projection(types = AttachmentContent.class)

public interface CustomAttachmentContent {
    Integer getId();

     byte[] getBytes();

     Attachment getAttachment();

}
