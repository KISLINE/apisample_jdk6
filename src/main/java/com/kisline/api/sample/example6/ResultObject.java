package com.kisline.api.sample.example6;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.Data;

@Data
@Getter(AccessLevel.PUBLIC)
@Setter(AccessLevel.PUBLIC)
public class ResultObject {
	private String amnisuyn;
	private String aettamt;
	private String audit_kor;

	private String biyul0;
	private String biyul1;
	private String biyul2;
	private String biyul3;
	private String biyul4;
	private String biyul6;
	private String biyul7;
	private String bizno;
	private String bnknm;
	private String bogosu;
	private String business;

	private String chk_cont;
	private String cmprt0;
	private String cmprt1;
	private String cmprt2;
	private String code;
	private String cont;
	private String contents;

	private String date;
	private String depth;
	private String divnm;

	private String edamt;
	private String empnum_bse_date;
	private String engentrnm;
	private String etl_ipc_yn;

	private String fa_ogx_yn;
	private String fadivcd;
	private String farptcd;
	private String farptitemcd;
	private String feeamt;
	private String fvl0;
	private String fvl1;
	private String fvl2;

	private String grpnm;

	private String han0;
	private String han1;
	private String han2;
	private String han3;
	private String han6;
	private String hang;

	private String indrt0;
	private String indrt1;
	private String indrt2;
	private String item;
	private String items;

	private String kiscode;
	private String kor_tofivnt;
	private String korentrnm;

	private String loginid;
	private String lgn_usrid;

	private String mainpdtpcl;
	private String monunit;
	private String msg;

	private String name;
	private String name_eng;
	private String name_kor;
	private String nice0;
	private String nice1;
	private String nice2;
	private String nice3;
	private String nice6;

	private String opt_entrnm;

	private String parent;

	private String s_seq;
	private String sbn_date;
	private String seq;
	private String stac_date;
	private String stac_yyyy;
	private String stac_yyyy0;
	private String stacdivcd;
	private String stamt;
	private String stkcd;

	private String tlevel;

	private String upchecd;
	private String usrnm;

	private String watchgrdnm;

	private String zcd1;
	private String zcd2;
	private String zcd3;

	@Override
	public String toString() {
		return "ResultObject [code=" + code + "]";
	}

}
