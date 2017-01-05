package org.mdacc.ristore.ws.fm.repository;

import java.util.List;

import org.mdacc.ristore.ws.fm.models.FmReportTb;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


@Repository
public interface FmReportRepository extends JpaRepository<FmReportTb, Long> {
	@Cacheable("fmreports")
	@EntityGraph("FmReportGraph")
	@Query("select f from FmReportTb f where f.deleteTs is null")
	public List<FmReportTb> findAllFmReports();
	
	@EntityGraph("FmReportGraph")
	@Query("select f from FmReportTb f where f.frBlockId=?1 and f.deleteTs is null")
	public List<FmReportTb> findByBlockId(String blockId);
	
	@EntityGraph("FmReportGraph")
	@Query("select f from FmReportTb f where f.frReportId=?1 and f.deleteTs is null")
	public List<FmReportTb> findByReportId(String reportId);	
}
