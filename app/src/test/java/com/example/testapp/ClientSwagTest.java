package com.example.testapp;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.runners.MockitoJUnitRunner;
import org.robolectric.Robolectric;

import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class ClientSwagTest {

    @Mock private Fragment mockFragment;

    @Before
    public void setup() {
        MockitoAnnotations.initMocks(this);
        FragmentActivity activity = Robolectric.setupActivity(FragmentActivity.class);
//                Robolectric.buildActivity(FragmentActivity.class).create().get();

        when(mockFragment.getActivity()).thenReturn(activity);
    }

    @Test
    public void testcheck123() {
        ClientSwag cs = new ClientSwag(mockFragment);
        cs.getActivity();
        Assert.assertEquals(cs.test(), "test");
    }
}
