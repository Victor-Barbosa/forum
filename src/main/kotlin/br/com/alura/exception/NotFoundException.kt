package br.com.alura.exception

import java.lang.RuntimeException


class NotFoundException(message: String?): RuntimeException(message) {
}