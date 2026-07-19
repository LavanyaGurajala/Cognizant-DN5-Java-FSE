package com.ormlearn.repository;

import com.ormlearn.entity.Employee;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Predicate;
import jakarta.persistence.criteria.Root;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class EmployeeRepositoryImpl implements EmployeeRepositoryCustom {
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<Employee> findByCriteria(String nameContains) {
        CriteriaBuilder criteriaBuilder = entityManager.getCriteriaBuilder();
        CriteriaQuery<Employee> query = criteriaBuilder.createQuery(Employee.class);
        Root<Employee> root = query.from(Employee.class);
        Predicate namePredicate = criteriaBuilder.like(
                criteriaBuilder.lower(root.get("name")),
                "%" + nameContains.toLowerCase() + "%"
        );
        query.select(root).where(namePredicate);
        return entityManager.createQuery(query).getResultList();
    }
}
