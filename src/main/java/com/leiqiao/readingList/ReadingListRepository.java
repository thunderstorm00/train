package com.leiqiao.readingList;

/**
 * Created by qaio.lei on 2017/5/10.
 */

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ReadingListRepository extends JpaRepository<Book, Long> {
    List<Book> findByReader(String reader);
}