package com.scienjus.repository;

import com.scienjus.domain.User;
import org.springframework.data.repository.CrudRepository;

/**
 * User类的CRUD操作
 * @see com.scienjus.domain.User
 * @author ScienJus
 * @date 2015/7/10.
 */
//spring无法根据此接口的bean类型创建有效的bean
public interface UserRepository extends CrudRepository<User, Long> {

    public User findByUsername(String username);
}
