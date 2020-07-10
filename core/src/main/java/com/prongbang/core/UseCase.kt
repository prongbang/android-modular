package com.prongbang.core

interface UseCase<P, R> {
	fun execute(params: P): R
}