package com.data.mig.read.json.extract.test;

import java.sql.SQLException;

import org.junit.Test;

import com.data.mig.read.json.extract.ReadJsonDataFromFile;

import junit.framework.Assert;

@SuppressWarnings("deprecation")
public class ReadJsonDataFromSubsequentExtractFileToMongoTest {

	@Test
	public void getMysqlDataExtractTest() throws SQLException {

		ReadJsonDataFromFile readJsonDataFromFile = new ReadJsonDataFromFile();

		boolean fileReadSuccess = readJsonDataFromFile.readJsonDataFromFile("test", "mycol111",
				"D:\\Sampath\\MS\\Dissertation\\MySQL\\subextract.json", "payments");

		Assert.assertTrue(fileReadSuccess);

	}

}
