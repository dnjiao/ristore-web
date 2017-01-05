package org.mdacc.ristore.ws.fm.repository;

import java.util.List;

import org.mdacc.ristore.ws.fm.models.SpecimenTb;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface SpecimenRepository extends JpaRepository<SpecimenTb, Long> {
	
	@Query("select s from SpecimenTb s where s.mrn=?1 and s.specimenSource='FM'")
	public List<SpecimenTb> findFmSpecimenByMrn(String mrn);

}
