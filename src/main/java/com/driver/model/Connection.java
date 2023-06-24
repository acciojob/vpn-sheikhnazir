package com.driver.model;

import jdk.internal.module.ServicesCatalog;

import javax.persistence.*;

@Entity
public class Connection {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    @JoinColumn
    private ServicesCatalog.ServiceProvider serviceProvider;

    @ManyToOne
    @JoinColumn
    private User user;

    public Connection() {
    }

    public Connection(int id, ServicesCatalog.ServiceProvider serviceProvider, User user) {
        this.id = id;
        this.serviceProvider = serviceProvider;
        this.user = user;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ServicesCatalog.ServiceProvider getServiceProvider() {
        return serviceProvider;
    }

    public void setServiceProvider(ServicesCatalog.ServiceProvider serviceProvider) {
        this.serviceProvider = serviceProvider;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}