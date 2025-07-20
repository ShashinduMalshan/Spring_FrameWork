package com.service.back_end.Ropository;

import com.service.back_end.entity.Job;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
    public interface JobRepository  extends JpaRepository<Job,Integer> {

    @Transactional
    @Modifying
    @Query(value = "UPDATE job SET status = 'Deactivate' WHERE id =?1", nativeQuery = true)
    void updateStatus(String id);
    List<Job> findJobByJobTitleContainingIgnoreCase(String keyword);


}



    /**
     * 🔹 Spring Data JPA Method Naming Convention Guide
     *
     * 📌 Structure:
     *     Prefix + FieldName + Operator + Conjunction
     *
     * 🔹 Prefixes (Purpose):
     *     - findBy       → Used to retrieve data
     *     - readBy       → Alternative to findBy
     *     - getBy        → Similar to findBy
     *     - countBy      → Returns the count of matching records
     *     - existsBy     → Checks existence of a record
     *     - deleteBy     → Deletes matching records
     *
     * 🔹 Field Names:
     *     - Use exact entity attribute names (case-sensitive)
     *
     * 🔹 Operators:
     *     - Is / Equals             → Equality check
     *     - IsNull / IsNotNull      → Null checks
     *     - LessThan                → <
     *     - LessThanEqual           → ≤
     *     - GreaterThan             → >
     *     - GreaterThanEqual        → ≥
     *     - Between                 → Within a range
     *     - In / NotIn              → Matches within a list
     *     - Like / NotLike          → Pattern matching
     *     - Containing              → LIKE %value%
     *     - StartingWith            → LIKE value%
     *     - EndingWith              → LIKE %value
     *     - IgnoreCase              → Case-insensitive comparison
     *
     * 🔹 Conjunctions:
     *     - And                     → Combine multiple conditions
     *     - Or                      → Match any of the conditions
     *
     * 📝 Example Methods:
     *     - findByFirstNameAndLastName(String first, String last)
     *     - countByStatus(String status)
     *     - deleteByCreatedAtBefore(LocalDate date)
     *     - findByEmailContainingIgnoreCase(String keyword)
     */


