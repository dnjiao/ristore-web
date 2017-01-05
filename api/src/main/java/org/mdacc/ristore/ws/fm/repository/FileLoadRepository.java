package org.mdacc.ristore.ws.fm.repository;

import org.mdacc.ristore.ws.fm.models.FileLoadTb;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface FileLoadRepository extends JpaRepository<FileLoadTb, Long> {
	@Query("select f.uri from FileLoadTb f where f.rowId=?1")
	public String findUriByFileLoadId(long id);

}
