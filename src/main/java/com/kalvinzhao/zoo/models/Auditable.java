package com.kalvinzhao.zoo.models;

import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.util.Date;

@MappedSuperclass // we are going to save these fields to the database but it's going to be saved with the children
@EntityListeners(AuditingEntityListener.class)
abstract class Auditable {
    @CreatedBy
    protected String createdBy;

    @CreatedDate
    @Temporal(TemporalType.TIMESTAMP)
    protected Date createdDate;
    @LastModifiedBy
    protected String lastModifiedBy;
    @CreatedDate
    @Temporal(TemporalType.TIMESTAMP)
    protected Date lastModifiedDate;
}
