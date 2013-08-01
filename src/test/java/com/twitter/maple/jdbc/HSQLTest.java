package com.twitter.maple.jdbc;

import java.io.IOException;

import org.junit.Before;


/**
 * This class runs the tests against an instance of hsql: http://hsqldb.org/
 * */
public class HSQLTest extends JDBCTestingBase
  {


	@Before
  public void setUp() throws IOException
    {
    setJdbcurl("jdbc:hsqldb:mem://testing;hsqldb.tx=mvcc");
    setDriverName("org.hsqldb.jdbcDriver");
    }
	
  }
