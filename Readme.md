Android密钥认证测试应用程序
==============================

这个应用支持生成,保存,加载,解析和验证Android[密钥和ID认证](https://source.android.com/docs/security/features/keystore/attestation)数据

该应用用于本地测试,因此没有网络权限.证书吊销数据嵌入在apk中,不会在线更新.如果系统被破坏,解析和验证将是不安全的,你应该将数据保存到文件中,然后在另一台设备上加载文件进行验证

这个应用还支持加载由其他软件生成的认证数据,支持的存储格式是 [PkiPath 和 PKCS7](https://docs.oracle.com/en/java/javase/17/docs/specs/security/standard-names.html#certpath-encodings)

---
注意!该分支可能存在严重问题,谨慎使用

可能有用链接
---

[官方文档](https://developer.android.com/privacy-and-security/security-key-attestation)

[官方实现](https://cs.android.com/android/platform/superproject/main/+/main:frameworks/base/services/core/java/com/android/server/security/AttestationVerificationPeerDeviceVerifier.java)

[授权标签](https://cs.android.com/android/platform/superproject/+/main:hardware/interfaces/security/keymint/aidl/android/hardware/security/keymint/Tag.aidl)

[密钥认证扩展数据架构](https://cs.android.com/android/platform/superproject/+/main:hardware/interfaces/security/keymint/aidl/android/hardware/security/keymint/KeyCreationResult.aidl)

[RKP 文档](https://cs.android.com/android/platform/superproject/+/main:hardware/interfaces/security/rkp/README.md)

[传统密钥主标签](https://cs.android.com/android/platform/superproject/+/main:hardware/interfaces/keymaster/3.0/types.hal)

许可证
-------

根据 Apache 许可证 2.0 版（“许可证”）授权；
除非你遵守许可证，否则不得使用此文件。
你可以在以下网址获得许可证的副本：

    http://www.apache.org/licenses/LICENSE-2.0

除非适用法律要求或书面同意，否则根据许可证分发的软件是基于“按原样”分发的基础上进行的，
不提供任何明示或暗示的保证或条件。
有关许可证下的权利和限制的具体语言，请参见许可证。
