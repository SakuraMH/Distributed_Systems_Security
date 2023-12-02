package org.sid.walletservice.repositories;
import org.sid.walletservice.entities.WalletTransaction;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface WalletTransactionRepository extends JpaRepository<WalletTransaction,String> {
 List<WalletTransaction> findByWalletId(String walletId);
}
