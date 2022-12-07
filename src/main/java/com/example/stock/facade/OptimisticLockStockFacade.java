package com.example.stock.facade;

import com.example.stock.service.OptimisticLockStcokService;
import org.springframework.stereotype.Service;

@Service
public class OptimisticLockStockFacade {

    private OptimisticLockStcokService optimisticLockStcokService;

    public OptimisticLockStockFacade(OptimisticLockStcokService optimisticLockStcokService) {
        this.optimisticLockStcokService = optimisticLockStcokService;
    }

    public void decrease(Long id, Long quantity) throws InterruptedException {
        while(true) {
            try {
                optimisticLockStcokService.decrease(id, quantity);
                break;
            } catch (Exception e) {
                Thread.sleep(50); // Exception 발생 시 0.05초 후 다시 시도

            }
        }
    }
}
