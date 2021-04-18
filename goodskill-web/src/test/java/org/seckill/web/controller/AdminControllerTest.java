package org.seckill.web.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.assertj.core.util.Lists;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.seckill.api.service.*;
import org.seckill.entity.Role;

import static org.junit.Assert.assertNotNull;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class AdminControllerTest {
    @InjectMocks
    private AdminController adminController;
    @Mock
    private UserAccountService userService;
    @Mock
    private RoleService roleService;
    @Mock
    private UserRoleService userRoleService;
    @Mock
    private PermissionService permissionService;
    @Mock
    private RolePermissionService rolePermissionService;

    @Test
    public void role() {
        Page<Role> page = new Page<>();
        Role role = new Role();
        page.setRecords(Lists.newArrayList(role));
        when(roleService.page(any())).thenReturn(page);
        assertNotNull(adminController.role(1,1));
    }

    @Test
    public void roleLess() {
    }

    @Test
    public void addRole() {
    }

    @Test
    public void deleteRole() {
    }

    @Test
    public void permission() {
    }

    @Test
    public void permissionTree() {
    }

    @Test
    public void addPermission() {
    }

    @Test
    public void deletePermission() {
    }

    @Test
    public void user() {
    }

    @Test
    public void deleteUser() {
    }

    @Test
    public void testAddRole() {
    }

    @Test
    public void updateRolePermission() {
    }
}