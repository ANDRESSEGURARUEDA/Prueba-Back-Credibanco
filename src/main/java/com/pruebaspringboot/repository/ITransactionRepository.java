package com.pruebaspringboot.repository;

import com.pruebaspringboot.entity.TransactionEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ITransactionRepository extends JpaRepository<TransactionEntity, Long> {

    TransactionEntity findByHash(String hash);
    TransactionEntity findByNumberReference(int numberReference);

}
