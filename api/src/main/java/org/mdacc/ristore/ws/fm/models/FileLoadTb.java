package org.mdacc.ristore.ws.fm.models;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the FILE_LOAD_TB database table.
 * 
 */
@Entity
@Table(name="FILE_LOAD_TB")
@NamedQuery(name="FileLoadTb.findAll", query="SELECT f FROM FileLoadTb f")
public class FileLoadTb implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
//	@SequenceGenerator(name="FILE_LOAD_TB_ROWID_GENERATOR", sequenceName="FILE_LOAD_SEQ")
//	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="FILE_LOAD_TB_ROWID_GENERATOR")
	@Column(name="ROW_ID")
	private long rowId;

	private String comments;

	@Column(name="ETL_PROC_ID")
	private BigDecimal etlProcId;

	@Column(name="FILE_QUEUE_ID")
	private BigDecimal fileQueueId;

	@Column(name="FILE_SIZE")
	private BigDecimal fileSize;

	@Column(name="FILE_TYPE_ID")
	private BigDecimal fileTypeId;

	@Temporal(TemporalType.DATE)
	@Column(name="INSERT_TS", updatable=false)
	private Date insertTs;

	@Column(name="LOAD_STATUS")
	private String loadStatus;

	private String name;

	@Column(name="SEQ_NUM")
	private BigDecimal seqNum;

	@Column(name="SOURCE_SYSTEM")
	private String sourceSystem;

	@Temporal(TemporalType.DATE)
	@Column(name="UPDATE_TS")
	private Date updateTs;

	private String uri;

	public FileLoadTb() {
	}

	public FileLoadTb(long rowId, BigDecimal etlProcId, BigDecimal fileQueueId, BigDecimal fileTypeId, Date insertTs,
			String name, BigDecimal seqNum, Date updateTs, String uri) {
		super();
		this.rowId = rowId;
		this.etlProcId = etlProcId;
		this.fileQueueId = fileQueueId;
		this.fileTypeId = fileTypeId;
		this.insertTs = insertTs;
		this.name = name;
		this.seqNum = seqNum;
		this.updateTs = updateTs;
		this.uri = uri;
	}

	public long getRowId() {
		return this.rowId;
	}

	public void setRowId(long rowId) {
		this.rowId = rowId;
	}

	public String getComments() {
		return this.comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	public BigDecimal getEtlProcId() {
		return this.etlProcId;
	}

	public void setEtlProcId(BigDecimal etlProcId) {
		this.etlProcId = etlProcId;
	}

	public BigDecimal getFileQueueId() {
		return this.fileQueueId;
	}

	public void setFileQueueId(BigDecimal fileQueueId) {
		this.fileQueueId = fileQueueId;
	}

	public BigDecimal getFileSize() {
		return this.fileSize;
	}

	public void setFileSize(BigDecimal fileSize) {
		this.fileSize = fileSize;
	}

	public BigDecimal getFileTypeId() {
		return this.fileTypeId;
	}

	public void setFileTypeId(BigDecimal fileTypeId) {
		this.fileTypeId = fileTypeId;
	}

	public Date getInsertTs() {
		return this.insertTs;
	}

	public void setInsertTs(Date insertTs) {
		this.insertTs = insertTs;
	}

	public String getLoadStatus() {
		return this.loadStatus;
	}

	public void setLoadStatus(String loadStatus) {
		this.loadStatus = loadStatus;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public BigDecimal getSeqNum() {
		return this.seqNum;
	}

	public void setSeqNum(BigDecimal seqNum) {
		this.seqNum = seqNum;
	}

	public String getSourceSystem() {
		return this.sourceSystem;
	}

	public void setSourceSystem(String sourceSystem) {
		this.sourceSystem = sourceSystem;
	}

	public Date getUpdateTs() {
		return this.updateTs;
	}

	public void setUpdateTs(Date updateTs) {
		this.updateTs = updateTs;
	}

	public String getUri() {
		return this.uri;
	}

	public void setUri(String uri) {
		this.uri = uri;
	}

}