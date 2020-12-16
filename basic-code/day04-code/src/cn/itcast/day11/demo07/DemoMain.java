package cn.itcast.day11.demo07;

import java.sql.SQLOutput;

public class DemoMain {

    public static void main(String[] args) {
        Hero hero = new Hero();
        hero.setName("影魔");//英雄名称

        //设置英雄技能
//        hero.setSkill(new SkillImpl());//使用单独定义的实现类

        //还可以改成使用匿名内部类
        Skill skill = new Skill() {
            @Override
            public void use() {
                System.out.println("Pia~pia~pia");
            }
        };
        hero.setSkill(skill);

        //进一步简化，同时使用匿名内部类，匿名对象
        hero.setSkill(new Skill() {
            @Override
            public void use() {
                System.out.println("aaaaaaaaaaa");
            }
        });


        hero.attack();
    }
}
