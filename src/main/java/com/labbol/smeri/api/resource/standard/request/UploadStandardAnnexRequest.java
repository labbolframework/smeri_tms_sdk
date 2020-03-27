package com.labbol.smeri.api.resource.standard.request;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;

import org.yelong.http.request.file.FileItemFactory;

import com.labbol.api.support.exception.APIRuleException;
import com.labbol.api.support.request.AbstractUploadFileAPIRequest;
import com.labbol.api.support.utils.RequestCheckUtils;
import com.labbol.smeri.api.resource.standard.response.UploadStandardAnnexResponse;

public class UploadStandardAnnexRequest extends AbstractUploadFileAPIRequest<UploadStandardAnnexResponse>{

	private String standardId;

	private String creator;

	private String updator;

	private String state;
	
	private static final String STANDARD_ANNEX_FIELDNAME = "file";
	
	public UploadStandardAnnexRequest() {
		super("/V1.0/service_resource/uploadStandardAnnex", "POST");
	}

	@Override
	public Class<UploadStandardAnnexResponse> getResponseClass() {
		return UploadStandardAnnexResponse.class;
	}

	public String getStandardId() {
		return standardId;
	}

	public void setStandardId(String standardId) {
		this.standardId = standardId;
		httpRequest.addParam("standardId", standardId);
	}

	public String getCreator() {
		return creator;
	}

	public void setCreator(String creator) {
		this.creator = creator;
		httpRequest.addParam("creator", creator);
	}

	public String getUpdator() {
		return updator;
	}

	public void setUpdator(String updator) {
		this.updator = updator;
		httpRequest.addParam("updator", updator);
	}
	
	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
		httpRequest.addParam("state", state);
	}

	public void setStandardAnnex(String fileName , byte [] fileByteArray) {
		httpRequest.addFileItem(STANDARD_ANNEX_FIELDNAME, FileItemFactory.create(fileName, fileByteArray));
	}
	
	public void setStandardAnnex(String fileName , InputStream is) throws IOException {
		httpRequest.addFileItem(STANDARD_ANNEX_FIELDNAME, FileItemFactory.create(fileName, is));
	}

	public void setStandardAnnex(File file) throws IOException {
		httpRequest.addFileItem(STANDARD_ANNEX_FIELDNAME, FileItemFactory.create(file));
	}
	
	@Override
	public void check() throws APIRuleException {
		RequestCheckUtils.checkNotEmpty(standardId, "standardId");
		RequestCheckUtils.checkNotEmpty(creator, "creator");
		RequestCheckUtils.checkNotEmpty(updator, "updator");
		RequestCheckUtils.checkNotEmpty(state, "state");
		RequestCheckUtils.checkNotEmpty(httpRequest.getFileItem(STANDARD_ANNEX_FIELDNAME), "file");
	}

}
