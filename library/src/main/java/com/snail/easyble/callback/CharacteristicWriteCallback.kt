package com.snail.easyble.callback

import com.snail.easyble.core.Device
import com.snail.easyble.core.MethodInfo
import com.snail.easyble.core.ValueTypePair
import java.util.*

/**
 *
 *
 * date: 2019/1/26 14:42
 * author: zengfansheng
 */
interface CharacteristicWriteCallback : RequestFailedCallback {
    companion object {
        internal fun getMethodInfo(device: Device, tag: String, serviceUuid: UUID, characteristicUuid: UUID, value: ByteArray): MethodInfo {
            return MethodInfo("onCharacteristicWrite", arrayOf(
                ValueTypePair(device, Device::class.java), ValueTypePair(tag, String::class.java),
                ValueTypePair(serviceUuid, UUID::class.java), ValueTypePair(characteristicUuid, UUID::class.java), ValueTypePair(value, ByteArray::class.java)
            ))
        }
    }
    
    fun onCharacteristicWrite(device: Device, tag: String, serviceUuid: UUID, characteristicUuid: UUID, value: ByteArray)
}