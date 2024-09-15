> 精誠資訊-第一週作業二

# 排序(Sorting) & 樂透號碼產生器(Lottery)

## 功能
* Sorting：根據年、月、日進行升冪或降冪排序。

* Lottery：隨機生成排除指定號碼後的6個1~49之間的樂透數字。

## 使用說明
### Sorting
* 輸入 `1` 執行升冪排序，輸入 `-1` 執行降冪排序：
```bash
# 升冪排序

java com.systex.main.Sorting 1

# 降冪排序

java com.systex.main.Sorting -1
```
### Lottery
* 第一個參數輸入張數，第二個數字輸入要排除的數字(**用空格隔開**)：
```bash
# 產出兩張樂透號碼，排除數字:5,25,30,33,46

java com.systex.model.Lottery 2 "5 25 30 33 46"
```
