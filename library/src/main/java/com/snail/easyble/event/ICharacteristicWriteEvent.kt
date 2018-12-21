package com.snail.easyble.event

/**
 * 使用方法: 在要监听的类中实现接口，并在方法上添加上@Subscribe注解
 * 时间: 2018/9/8 11:58
 * 作者: zengfansheng
 */
interface ICharacteristicWriteEvent {
    /**
     * onCharacteristicWrite，写入成功
     */
    fun onCharacteristicWrite(event: Events.CharacteristicWrite)
}