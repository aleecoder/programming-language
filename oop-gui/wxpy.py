# -*- coding: utf-8 -*-
"""
wxPython程序
"""
import wx


class MyFrame(wx.Frame):
    def __init__(self, superior):
        wx.Frame.__init__(self, parent=superior, title="Example", pos=(100, 200), size=(350, 200))
        panel = wx.Panel(self)
        text = wx.TextCtrl(panel, value="Hello the World!", size=(350, 200))


if __name__ == '__main__':
    app = wx.App()
    frame = MyFrame(None)
    frame.Show(True)
    app.MainLoop()
