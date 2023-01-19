package com.example.demo;

import java.util.Calendar;
import java.util.Date;

public class JudgeUtils extends MiraiPrjApplication {

	// 定数
	public static final int AGE = 17;

	/**
	 * 課金対象か判定するメソッド<br>
	 *
	 * @param birthDay 生年月日
	 * @return true:課金可能年齢 false:課金不可年齢
	 */
	public boolean isBillingAge(Date birthDay) {
		Calendar compareCal = Calendar.getInstance();

		compareCal.setTime(new Date());
		int curYear = compareCal.get(Calendar.YEAR);
		int curMonth = compareCal.get(Calendar.MONTH);
		int curDate = compareCal.get(Calendar.DATE);
		compareCal.clear();

		// 現在の年月日のみをセット
		compareCal.set(curYear, curMonth, curDate);
		// 年からプレイ可能年齢を引く
		compareCal.add(Calendar.YEAR, -AGE);

		// 生年月日を設定
		Calendar birthCal = Calendar.getInstance();
		birthCal.setTime(birthDay);

		// 判定処理開始
		// 比較用年月日よりあとの生年月日なら不可
		if (birthCal.compareTo(compareCal) > 0) {
			return false;
		}
		return true;
	}

	/**
	 * プレイ対象年齢未満か判定するメソッド<br>
	 *
	 * @param birthDay 生年月日
	 * @return true:プレイ可能年齢 false:プレイ不可年齢
	 */
	public boolean isRegisterdAge(Date birthDay) {
		Calendar compareCal = Calendar.getInstance();

		compareCal.setTime(new Date());
		int curYear = compareCal.get(Calendar.YEAR);
		int curMonth = compareCal.get(Calendar.MONTH);
		int curDate = compareCal.get(Calendar.DATE);
		compareCal.clear();

		// 現在の年月日のみをセット
		compareCal.set(curYear, curMonth, curDate);
		// 年からプレイ可能年齢を引く
		compareCal.add(Calendar.YEAR, -AGE);

		// 生年月日を設定
		Calendar birthCal = Calendar.getInstance();
		birthCal.setTime(birthDay);

		// 判定処理開始
		// 比較用年月日よりあとの生年月日なら不可
		if (birthCal.compareTo(compareCal) > 0) {
			return false;
		}
		return true;
	}
}
