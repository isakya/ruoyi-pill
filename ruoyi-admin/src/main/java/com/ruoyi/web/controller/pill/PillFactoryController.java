package com.ruoyi.web.controller.pill;

import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.page.TableDataInfo;
import com.ruoyi.pill.domain.PillFactory;
import com.ruoyi.pill.service.IPillFactoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/pill/factory")
public class PillFactoryController extends BaseController {
    @Autowired
    private IPillFactoryService pillFactoryService;

    @PreAuthorize("@ss.hasPermi('pill:factory:list')")
    @GetMapping("/list")
    public TableDataInfo list(PillFactory factory) {
        startPage();
        List<PillFactory> list = pillFactoryService.selectPillFactoryList(factory);
        return getDataTable(list);
    }
}
