package com.swsa.repository;
import java.util.List;

    public interface CardEntryRepository<T> {

        public String store(T t);

        public List<T> retrieve();

        public String search(int id);

        public String delete(int id);

        public String update(T t);
    }



