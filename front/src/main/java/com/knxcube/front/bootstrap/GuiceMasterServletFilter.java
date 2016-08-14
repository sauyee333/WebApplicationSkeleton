/*
 * Copyright (c) 2016. Livotov Labs Ltd.
 */

package com.knxcube.front.bootstrap;

import com.google.inject.servlet.GuiceFilter;

import javax.servlet.annotation.WebFilter;

@WebFilter(urlPatterns = "/*", asyncSupported = true)
public class GuiceMasterServletFilter extends GuiceFilter
{

}
