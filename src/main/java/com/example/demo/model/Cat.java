package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Cat")
public class Cat {

        @Id
        @GeneratedValue
        private int id;
        private String name;

        public Cat(){}

        public Cat(String name){
            this.name = name;
        }

        public Cat(int id, String name) {
            this.id = id;
            this.name = name;
        }

        //Getters
        public int getId() {
            return id;
        }

        public String getName() {
            return name;
        }

        //Setters
        public void setId(int id) {
            this.id = id;
        }
        public void setName(String name) {
            this.name = name;
        }
    }

