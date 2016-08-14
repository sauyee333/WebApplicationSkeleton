/*
 * Copyright (c) 2016. Livotov Labs Ltd.
 */

package com.knxcube.front.app.pages;

import de.agilecoders.wicket.extensions.markup.html.bootstrap.icon.FontAwesomeCDNCSSReference;
import org.apache.wicket.markup.head.CssHeaderItem;
import org.apache.wicket.markup.head.IHeaderResponse;
import org.apache.wicket.markup.head.PriorityHeaderItem;
import org.apache.wicket.markup.html.WebPage;

/**
 * (c) Livotov Labs Ltd. 2012
 * Date: 25/06/2016
 */
public abstract class BasePage extends WebPage
{

    @Override
    public void renderHead(IHeaderResponse response)
    {
        super.renderHead(response);
        response.render(new PriorityHeaderItem(CssHeaderItem.forReference(FontAwesomeCDNCSSReference.instance())));
    }
}
