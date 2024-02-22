package com.ruby.java.ch07.inheritance;

public class GalaxyMessenGerr implements WorkFile {
	

	@Override
	public void fileUpload() {
		System.out.println("file을 다운로드합니다.");

	}

	@Override
	public void fileDownload() {
		System.out.println("file을 업로드합니다.");

	}

}
