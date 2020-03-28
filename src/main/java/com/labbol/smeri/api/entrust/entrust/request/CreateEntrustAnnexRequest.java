package com.labbol.smeri.api.entrust.entrust.request;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;

import org.yelong.http.request.file.FileItemFactory;

import com.labbol.api.support.exception.APIRuleException;
import com.labbol.api.support.request.AbstractUploadFileAPIRequest;
import com.labbol.api.support.utils.RequestCheckUtils;
import com.labbol.smeri.api.entrust.entrust.response.CreateEntrustAnnexResponse;

/**
 * @author PengFei
 */
public class CreateEntrustAnnexRequest extends AbstractUploadFileAPIRequest<CreateEntrustAnnexResponse> {

	private String entrustId;
	
	private String fileClass;
	
	private String fileVersion;
	
	private String creator;
	
	private String updator;
	
	private String state;
	
	private static final String ENTRUST_ANNEX_FIELDNAME = "file";
	
	public CreateEntrustAnnexRequest() {
		super("/v1.0/service_entrust/createEntrustAnnex", "POST");
	}

	@Override
	public Class<CreateEntrustAnnexResponse> getResponseClass() {
		return CreateEntrustAnnexResponse.class;
	}

	public String getEntrustId() {
		return entrustId;
	}

	public void setEntrustId(String entrustId) {
		this.entrustId = entrustId;
		httpRequest.addParam("entrustId", entrustId);
	}

	public String getFileClass() {
		return fileClass;
	}

	public void setFileClass(String fileClass) {
		this.fileClass = fileClass;
		httpRequest.addParam("fileClass", fileClass);
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
		httpRequest.addFileItem(ENTRUST_ANNEX_FIELDNAME, FileItemFactory.create(fileName, fileByteArray));
	}
	
	public void setStandardAnnex(String fileName , InputStream is) throws IOException {
		httpRequest.addFileItem(ENTRUST_ANNEX_FIELDNAME, FileItemFactory.create(fileName, is));
	}

	public void setStandardAnnex(File file) throws IOException {
		httpRequest.addFileItem(ENTRUST_ANNEX_FIELDNAME, FileItemFactory.create(file));
	}
	
	public String getFileVersion() {
		return fileVersion;
	}

	public void setFileVersion(String fileVersion) {
		this.fileVersion = fileVersion;
		httpRequest.addParam("fileVersion", fileVersion);
	}

	@Override
	public void check() throws APIRuleException {
		RequestCheckUtils.checkNotEmpty(entrustId, "entrustId");
		RequestCheckUtils.checkNotEmpty(fileClass, "fileClass");
		RequestCheckUtils.checkNotEmpty(fileVersion, "fileVersion");
		RequestCheckUtils.checkNotEmpty(creator, "creator");
		RequestCheckUtils.checkNotEmpty(updator, "updator");
		RequestCheckUtils.checkNotEmpty(state, "state");
		RequestCheckUtils.checkNotEmpty(httpRequest.getFileItem(ENTRUST_ANNEX_FIELDNAME), "file");
	}

}
