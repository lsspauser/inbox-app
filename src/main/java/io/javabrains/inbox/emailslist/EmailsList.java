package io.javabrains.inbox.emailslist;

import org.springframework.data.cassandra.core.mapping.CassandraType;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

@Table(value = "emails_by_user")
public class EmailsList {
    
    @PrimaryKey
    private EmailsListPrimaryKey id;

    @CassandraType(type = CassandraType.Name.TEXT)
    private String from;

    @CassandraType(type = CassandraType.Name.TEXT)
    private String to;

    @CassandraType(type = CassandraType.Name.TEXT)
    private String subject;

    @CassandraType(type = CassandraType.Name.BOOLEAN)
    private boolean isRead;


    public EmailsListPrimaryKey getId() {
        return id;
    }

    public void setId(EmailsListPrimaryKey id) {
        this.id = id;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public boolean isRead() {
        return isRead;
    }

    public void setRead(boolean isRead) {
        this.isRead = isRead;
    }


}
