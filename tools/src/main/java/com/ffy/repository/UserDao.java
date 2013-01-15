package com.ffy.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import com.ffy.entity.User;

public interface UserDao extends PagingAndSortingRepository<User, Long> {
	User findByLoginName(String loginName);
}
