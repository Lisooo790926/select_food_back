package com.project.selectfood.repository;

import com.project.selectfood.models.AdditionalItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdditionItemsRepo extends JpaRepository<AdditionalItem, Long> {
}
