package com.example.vazifa_2.projection;

import com.example.vazifa_2.entity.Attachment;
import org.springframework.data.rest.core.config.Projection;

@Projection(types = Attachment.class)

public interface CustomAttachment {
    Integer getId();
    String getName();
    String getContentType();
     long getSize();

}
