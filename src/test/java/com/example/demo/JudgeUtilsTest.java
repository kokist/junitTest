package com.example.demo;

import static org.junit.jupiter.api.Assertions.*;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.junit.jupiter.api.Test;

class JudgeUtilsTest {
	
	private JudgeUtils target = new JudgeUtils();
	SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

	// ********************************
	// isBillingAge()Test
	// ********************************

	// ケースNo1
	// ケース内容：18歳(04/01)で課金可能
	// 誕生時刻(引数)：2000/04/01
	// 現在時刻：2018/04/01
	// 合格条件：true
	@Test
	public void testIsBillingAge_18歳_課金可能() {

		// 事前処理(Mock)
		Calendar cal = Calendar.getInstance();
		cal.clear();
		cal.set(Calendar.YEAR, 2018);
		cal.set(Calendar.MONTH, Calendar.APRIL);
		cal.set(Calendar.DAY_OF_MONTH, 01);
		Date date = cal.getTime();
		MockCurrentTime mockTime = new MockCurrentTime(date);

		// 引数
		Calendar birthcal = Calendar.getInstance();
		birthcal.clear();
		birthcal.set(Calendar.YEAR, 2000);
		birthcal.set(Calendar.MONTH, Calendar.APRIL);
		birthcal.set(Calendar.DAY_OF_MONTH, 01);
		Date birthDay = birthcal.getTime();

		// 実行
		boolean actual = target.isBillingAge(birthDay);

		//結果
		assertTrue(actual);
		mockTime.tearDown();
	}
	
	// ケースNo2
	// ケース内容：18歳(04/02)で課金可能
	// 誕生時刻(引数)：2000/04/01
	// 現在時刻：2018/04/02
	// 合格条件：true
	@Test
	public void testIsBillingAge_18歳_0402生まれ_課金可能() {

		// 事前処理(Mock)
		Calendar cal = Calendar.getInstance();
		cal.clear();
		cal.set(Calendar.YEAR, 2018);
		cal.set(Calendar.MONTH, Calendar.APRIL);
		cal.set(Calendar.DAY_OF_MONTH, 02);
		Date date = cal.getTime();
		MockCurrentTime mockTime = new MockCurrentTime(date);

		// 引数
		Calendar birthcal = Calendar.getInstance();
		birthcal.clear();
		birthcal.set(Calendar.YEAR, 2000);
		birthcal.set(Calendar.MONTH, Calendar.APRIL);
		birthcal.set(Calendar.DAY_OF_MONTH, 01);
		Date birthDay = birthcal.getTime();

		// 実行
		boolean actual = target.isBillingAge(birthDay);

		//結果
		assertTrue(actual);
		mockTime.tearDown();
	}

	// ケースNo3
	// ケース内容：17歳(04/01)で課金不可能
	// 誕生時刻(引数)：2000/04/01
	// 現在時刻：2017/04/01
	// 合格条件：false
	@Test
	public void testIsBillingAge_17歳_課金不可() {

		// 事前処理(Mock)
		Calendar cal = Calendar.getInstance();
		cal.clear();
		cal.set(Calendar.YEAR, 2017);
		cal.set(Calendar.MONTH, Calendar.APRIL);
		cal.set(Calendar.DAY_OF_MONTH, 01);
		Date date = cal.getTime();
		MockCurrentTime mockTime = new MockCurrentTime(date);

		// 引数
		Calendar birthcal = Calendar.getInstance();
		birthcal.clear();
		birthcal.set(Calendar.YEAR, 2000);
		birthcal.set(Calendar.MONTH, Calendar.APRIL);
		birthcal.set(Calendar.DAY_OF_MONTH, 01);
		Date birthDay = birthcal.getTime();

		// 実行
		boolean actual = target.isBillingAge(birthDay);

		//結果
		assertFalse(actual);
		mockTime.tearDown();
	}

	// ********************************
	// isRegisterdAge()
	// ********************************

	// ケースNo1
	// ケース内容：18歳(04/01)でプレイ可能
	// 誕生時刻(引数)：2000/04/01
	// 現在時刻：2018/04/01
	// 合格条件：true
	@Test
	public void testIsRegisterdAge_18歳_プレイ可能() {

		// 事前処理(Mock)
		Calendar cal = Calendar.getInstance();
		cal.clear();
		cal.set(Calendar.YEAR, 2018);
		cal.set(Calendar.MONTH, Calendar.APRIL);
		cal.set(Calendar.DAY_OF_MONTH, 01);
		Date date = cal.getTime();
		MockCurrentTime mockTime = new MockCurrentTime(date);

		// 引数
		Calendar birthcal = Calendar.getInstance();
		birthcal.clear();
		birthcal.set(Calendar.YEAR, 2000);
		birthcal.set(Calendar.MONTH, Calendar.APRIL);
		birthcal.set(Calendar.DAY_OF_MONTH, 01);
		Date birthDay = birthcal.getTime();

		// 実行
		boolean actual = target.isRegisterdAge(birthDay);

		//結果
		assertTrue(actual);
		mockTime.tearDown();
	}
	
	// ケースNo2
	// ケース内容：18歳(04/02)でプレイ可能
	// 誕生時刻(引数)：2000/04/01
	// 現在時刻：2018/04/02
	// 合格条件：true
	@Test
	public void testIsRegisterdAge_18歳_0402生まれ_プレイ可能() {

		// 事前処理(Mock)
		Calendar cal = Calendar.getInstance();
		cal.clear();
		cal.set(Calendar.YEAR, 2018);
		cal.set(Calendar.MONTH, Calendar.APRIL);
		cal.set(Calendar.DAY_OF_MONTH, 02);
		Date date = cal.getTime();
		MockCurrentTime mockTime = new MockCurrentTime(date);

		// 引数
		Calendar birthcal = Calendar.getInstance();
		birthcal.clear();
		birthcal.set(Calendar.YEAR, 2000);
		birthcal.set(Calendar.MONTH, Calendar.APRIL);
		birthcal.set(Calendar.DAY_OF_MONTH, 01);
		Date birthDay = birthcal.getTime();

		// 実行
		boolean actual = target.isRegisterdAge(birthDay);

		//結果
		assertTrue(actual);
		mockTime.tearDown();
	}

	// ケースNo3
	// ケース内容：17歳(04/01)でプレイ不可能
	// 誕生時刻(引数)：2000/04/01
	// 現在時刻：2017/04/01
	// 合格条件：false
	@Test
	public void testIsRegisterdAge_17歳_プレイ不可() {

	}
}
