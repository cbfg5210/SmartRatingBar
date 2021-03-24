# SmartRatingBar
[![](https://jitpack.io/v/com.gitee.cbfg5210/SmartRatingBar.svg)](https://jitpack.io/#com.gitee.cbfg5210/SmartRatingBar)

本项目是在 [xckevin/AndroidSmartRatingBar](https://github.com/xckevin/AndroidSmartRatingBar) 的基础上做了些小修改，
在此衷心感谢 [xckevin](https://github.com/xckevin) 的开源分享！

本项目 fix 了原库中 indicator 属性无效的问题，对代码进行了调整，并重命名了部分属性名。

## 引入依赖
### Step 1. Add the JitPack repository to your build file
```gradle
allprojects {
	repositories {
	  ...
	  maven { url 'https://jitpack.io' }
    }
}
```
### Step 2. Add the dependency
```gradle
dependencies {
	implementation 'com.gitee.cbfg5210:SmartRatingBar:$version'
}
```

## 属性说明

|  属性   | 类型  | 说明  |
|  ----  | ----  | ----  |
| srbNumStars  | integer | 星星数量 |
| srbGap  | dimension | 间隔距离 |
| srbRating  | float | 分数值 |
| srbStepSize  | float | 打分步长 |
| srbOrientation  | integer | 排列方向 |
| srbFullDrawable  | reference | 满分的图片 |
| srbEmptyDrawable  | reference | 零分的图片 |
| srbIsIndicator  | boolean | 是否只作为指示，是的话用户点击不会改变评分状态 |

## Demo 截图
![demo 截图](https://gitee.com/cbfg5210/SmartRatingBar/raw/master/arts/SmartRatingBar.png)