# 题目1
关于this关键字，下面说法正确的是：（）

A：this关键字可以区分成员变量和局部变量；

B：this关键字可以用来在构造函数中调用其它构造函数；

C：this关键字可以用在函数中，表示对调用这个函数的对象的引用；

D：以上说法都是正确的；

答案 D

# 题目2
关于Java的继承，下面说法正确的是：（）

A：子类继承父类，可以继承父类所有成员；

B：子类继承父类，可以继承父类一般函数和构造函数；

C：子类继承父类，可以继承父类非私有成员；

D：子类继承父类，不能继承父类构造函数；

答案 D

# 题目3
关于Java的继承，下面说法正确的是：（）

A：一个类只能同时继承一个父类；

B：一个类可以同时继承多个父类；

C：一个类只能有一个子类；

D：一个类可以继承任何一个其他类；

答案 A

# 题目4
下面说法正确的是：（）

A：方法重写就是指，在同一个类中允许存在多个名称相同，但参数列表不同的函数；

B：方法重写与方法返回值类型无关

C：方法重写时，子类重写的方法是否使用static关键字修饰，应该根据具体需求确定；

D：方法重写时，子类重写的方法的访问权限，不能比父类被重写方法的访问权限低；

答案 D

# 题目5
下面说法正确的是：（）

A：一般开发中，子类应该重写父类所有方法；

B：一般开发中，子类应该重写父类不满足子类需要的方法；

C：一般开发中，子类很少重写父类方法；

D：上面说法都不正确；

答案 B

# 答案6
下面说法正确的是：（）

A：子类实例化时，要先创建父类对象，然后再创建子类对象；

B：子类实例化时，先创建子类对象，再创建父类对象；

C：子类实例化时，先调用子类构造函数进栈，然后再子类构造函数中通过super语句调用父类构造函数，执行完父类构造函数再执行子类构造函数；

D：子类实例化时，先调用父类构造函数进栈，执行完毕再执行子类构造函数；

答案 C

# 答案7
下面说法正确的是：（）

A：因为抽象类不能创建对象，所以抽象类没有构造函数；

B：抽象类就是有抽象方法的类；

C：抽象类中只能书写抽象方法；

D：子类继承抽象父类，应该实现父类中所有抽象函数，否则这个子类也应该是抽象类；

答案 D

# 答案8
下面说法错误的是：（）

A：因为抽象类不能创建对象，所以需要由子类继承；

B：子类继承抽象父类，应该重写父类中所有函数；

C：如果一个类中有抽象方法，这个类一定是抽象类；

D：抽象方法是用来表示描述不清的功能的；

答案 B

# 答案9
下面说法正确的是：（）

A：final修饰构造函数，表示子类不能重写；

B：final关键字可以修饰Object类；

C：final可以修饰成员变量，不能修饰局部变量；

D：final不能修饰抽象方法，因为抽象方法必须被子类重写，而final修饰的方法不能被子类重写；

答案 D


# 答案10
下面说法正确的是：（）

A：修饰方法时，abstract关键字不能和final、static关键字一起使用，但可以和private一起使用；

B：非静态成员内部类中可以书写任意成员；

C：final修饰引用类型的变量，变量中保存的引用地址不能改，但是引用指向的对象中的数据可以改；

D：抽象类的构造函数不能是私有的；

答案 C

# 问答题
## 继承
### 题目1
子类继承父类用什么关键字？
用extends关键字

### 题目2
子类继承父类的好处是什么？
通过继承实现代码复用，减少代码书写量。容易修改和扩张已有的实现。

### 题目3
父类的那些成员不能被继承，或者不能被访问？
私有成员不能被继承，构造方法不能被继承。

### 题目4
子类的是否可以同时继承多个子类？
子类只能继承一个父类，但是可以实现多个接口，Java 不支持多重继承，C++ 支持多重继承。


## 抽象类
### 题目1
定义抽象类，抽象方法的关键字是什么？
abstract

### 题目2
定义抽象类的作用？
将类的公共部分抽象出来，作为抽象类的一部分，抽象类是多态的重要体现。

### 题目3
定义抽象方法有什么作用？
强制子类重写抽象方法。

### 题目4
一个类继承抽象类以后，必须要做的事情是什么？
实现其抽象方法。

### 题目5
请问抽象类是否可以继承其他抽象类？
抽象类可以继承其他抽象类。

## final
### 题目1
final 可以修饰的元素？以及修饰后的含义
1. 类，2. 成员方法，3. 成员属性，4. 构造方法， 5. 局部变量
#### 类
修饰类表示此类不能被继承

#### 成员方法
表示此方法不能重写

#### 修饰变量
表示变量不能被修改，即为常量。
当修饰基本类型变量，表示此变量不能被修改，为常量。
当修饰引用类变量时，表示此引用类型存放的对象的内存地址不可以被修改，但是对象指向的内容可以被修改。

### 题目2
请问final是否可以修饰形参？如果可以，它有什么意义？
可以修饰形参，当final参数为形参的时候，可以读取使用该参数，但是无法改变该参数的值。



