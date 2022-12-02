package org.taymyr.lagom.soap

class SoapTransportException(val errorCode: String, message: String) : RuntimeException(message)
