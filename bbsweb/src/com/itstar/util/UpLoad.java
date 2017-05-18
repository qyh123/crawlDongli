package com.itstar.util;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Date;

import org.apache.struts.upload.FormFile;

public class UpLoad {
	/**
	 * 文件上传
	 * 
	 * @param dir
	 *            上传文件的路径
	 * @param formFile
	 *            上传的文件
	 * @return 返回来个新的文件名
	 */
	public String upload(String dir, FormFile formFile) throws Exception {

		Date date = new Date();
		// 取欲上传的文件的名字和长度
		String fname = formFile.getFileName();
		File uploadFile = new File(fname);
		// 将上传时间加入文件名
		int i = fname.lastIndexOf(".");
		String name = String.valueOf(date.getTime());
		String type = fname.substring(i + 1);
		fname = name + "." + type;
		InputStream streamIn = formFile.getInputStream(); // 创建读取用户上传文件的对象
		uploadFile = new File(dir);
		// 创建把上传数据写到目标文件的对象
		if (!uploadFile.exists() || uploadFile == null) { // 判断指定路径是否存在，不存在则创建路径
			uploadFile.mkdirs();
		}
		String path = uploadFile.getPath() + "/" + fname;
		OutputStream streamOut = new FileOutputStream(path);
		int bytesRead = 0;
		byte[] buffer = new byte[8192];
		while ((bytesRead = streamIn.read(buffer, 0, 8192)) != -1) {
			streamOut.write(buffer, 0, bytesRead);
		}
		streamOut.close();
		streamIn.close();
		formFile.destroy();
		return fname;
	}
}
