package com.dbc.entity;

/**
 * TbComand entity. @author MyEclipse Persistence Tools
 */

public class TbComand implements java.io.Serializable {

	// Fields

	private String cmadName;
	private String id;
	private String no;
	private String userName;
	private String gov;
	private String areaplace;
	private String tecnameMg;
	private String minyear;
	private String maxyear;
	private String comandMg1;
	private String comandMg2;
	private String comandMg3;
	private String keyword1;
	private String keyword2;
	private String keyword3;
	private String keyword4;
	private String keyword5;
	private String nimoney;
	private String useKind;
	private String areaKind;
	private String xuekeKind;
	private String cmadModel;
	private String corrComp;
	private String shstate;
	private String tjstate;
	private String xsstate;
	private String bsstate;
	private String fpbm;
	private String shyj;

	// Constructors

	/** default constructor */
	public TbComand() {
	}

	/** minimal constructor */
	public TbComand(String cmadName, String id, String no, String userName,
			String areaplace, String tecnameMg, String minyear, String maxyear,
			String comandMg1, String comandMg2, String comandMg3,
			String keyword1, String cmadModel, String corrComp) {
		this.cmadName = cmadName;
		this.id = id;
		this.no = no;
		this.userName = userName;
		this.areaplace = areaplace;
		this.tecnameMg = tecnameMg;
		this.minyear = minyear;
		this.maxyear = maxyear;
		this.comandMg1 = comandMg1;
		this.comandMg2 = comandMg2;
		this.comandMg3 = comandMg3;
		this.keyword1 = keyword1;
		this.cmadModel = cmadModel;
		this.corrComp = corrComp;
	}

	/** full constructor */
	public TbComand(String cmadName, String id, String no, String userName,
			String gov, String areaplace, String tecnameMg, String minyear,
			String maxyear, String comandMg1, String comandMg2,
			String comandMg3, String keyword1, String keyword2,
			String keyword3, String keyword4, String keyword5, String nimoney,
			String useKind, String areaKind, String xuekeKind,
			String cmadModel, String corrComp, String shstate, String tjstate,
			String xsstate, String bsstate, String fpbm, String shyj) {
		this.cmadName = cmadName;
		this.id = id;
		this.no = no;
		this.userName = userName;
		this.gov = gov;
		this.areaplace = areaplace;
		this.tecnameMg = tecnameMg;
		this.minyear = minyear;
		this.maxyear = maxyear;
		this.comandMg1 = comandMg1;
		this.comandMg2 = comandMg2;
		this.comandMg3 = comandMg3;
		this.keyword1 = keyword1;
		this.keyword2 = keyword2;
		this.keyword3 = keyword3;
		this.keyword4 = keyword4;
		this.keyword5 = keyword5;
		this.nimoney = nimoney;
		this.useKind = useKind;
		this.areaKind = areaKind;
		this.xuekeKind = xuekeKind;
		this.cmadModel = cmadModel;
		this.corrComp = corrComp;
		this.shstate = shstate;
		this.tjstate = tjstate;
		this.xsstate = xsstate;
		this.bsstate = bsstate;
		this.fpbm = fpbm;
		this.shyj = shyj;
	}

	// Property accessors

	public String getCmadName() {
		return this.cmadName;
	}

	public void setCmadName(String cmadName) {
		this.cmadName = cmadName;
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNo() {
		return this.no;
	}

	public void setNo(String no) {
		this.no = no;
	}

	public String getUserName() {
		return this.userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getGov() {
		return this.gov;
	}

	public void setGov(String gov) {
		this.gov = gov;
	}

	public String getAreaplace() {
		return this.areaplace;
	}

	public void setAreaplace(String areaplace) {
		this.areaplace = areaplace;
	}

	public String getTecnameMg() {
		return this.tecnameMg;
	}

	public void setTecnameMg(String tecnameMg) {
		this.tecnameMg = tecnameMg;
	}

	public String getMinyear() {
		return this.minyear;
	}

	public void setMinyear(String minyear) {
		this.minyear = minyear;
	}

	public String getMaxyear() {
		return this.maxyear;
	}

	public void setMaxyear(String maxyear) {
		this.maxyear = maxyear;
	}

	public String getComandMg1() {
		return this.comandMg1;
	}

	public void setComandMg1(String comandMg1) {
		this.comandMg1 = comandMg1;
	}

	public String getComandMg2() {
		return this.comandMg2;
	}

	public void setComandMg2(String comandMg2) {
		this.comandMg2 = comandMg2;
	}

	public String getComandMg3() {
		return this.comandMg3;
	}

	public void setComandMg3(String comandMg3) {
		this.comandMg3 = comandMg3;
	}

	public String getKeyword1() {
		return this.keyword1;
	}

	public void setKeyword1(String keyword1) {
		this.keyword1 = keyword1;
	}

	public String getKeyword2() {
		return this.keyword2;
	}

	public void setKeyword2(String keyword2) {
		this.keyword2 = keyword2;
	}

	public String getKeyword3() {
		return this.keyword3;
	}

	public void setKeyword3(String keyword3) {
		this.keyword3 = keyword3;
	}

	public String getKeyword4() {
		return this.keyword4;
	}

	public void setKeyword4(String keyword4) {
		this.keyword4 = keyword4;
	}

	public String getKeyword5() {
		return this.keyword5;
	}

	public void setKeyword5(String keyword5) {
		this.keyword5 = keyword5;
	}

	public String getNimoney() {
		return this.nimoney;
	}

	public void setNimoney(String nimoney) {
		this.nimoney = nimoney;
	}

	public String getUseKind() {
		return this.useKind;
	}

	public void setUseKind(String useKind) {
		this.useKind = useKind;
	}

	public String getAreaKind() {
		return this.areaKind;
	}

	public void setAreaKind(String areaKind) {
		this.areaKind = areaKind;
	}

	public String getXuekeKind() {
		return this.xuekeKind;
	}

	public void setXuekeKind(String xuekeKind) {
		this.xuekeKind = xuekeKind;
	}

	public String getCmadModel() {
		return this.cmadModel;
	}

	public void setCmadModel(String cmadModel) {
		this.cmadModel = cmadModel;
	}

	public String getCorrComp() {
		return this.corrComp;
	}

	public void setCorrComp(String corrComp) {
		this.corrComp = corrComp;
	}

	public String getShstate() {
		return this.shstate;
	}

	public void setShstate(String shstate) {
		this.shstate = shstate;
	}

	public String getTjstate() {
		return this.tjstate;
	}

	public void setTjstate(String tjstate) {
		this.tjstate = tjstate;
	}

	public String getXsstate() {
		return this.xsstate;
	}

	public void setXsstate(String xsstate) {
		this.xsstate = xsstate;
	}

	public String getBsstate() {
		return this.bsstate;
	}

	public void setBsstate(String bsstate) {
		this.bsstate = bsstate;
	}

	public String getFpbm() {
		return this.fpbm;
	}

	public void setFpbm(String fpbm) {
		this.fpbm = fpbm;
	}

	public String getShyj() {
		return this.shyj;
	}

	public void setShyj(String shyj) {
		this.shyj = shyj;
	}

}